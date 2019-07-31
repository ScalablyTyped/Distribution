organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-5e312e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-2a4414",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-4670b4",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-c5f4a8",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-3ba3bf",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-6be48d",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-7de11d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        