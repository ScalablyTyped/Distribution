organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-0b0570"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-00cbb8",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-4cb8cb",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-c5f4a8",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-7a4853",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-3613ad",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-7baf84")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        