organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-9b02f7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-484e03",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-3110c3",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191015Z-4f243e",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-06bc12",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-7195e6",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-23152e",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-7bd055")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        