organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-e3eda5"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-c024d7",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-2b98c8",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-fc403d",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-5a029c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-34f314",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-af2ede")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        