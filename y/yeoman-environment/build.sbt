organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190522Z-21fbad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-da8edf",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-763b3a",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-aa18c5",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-68ab11",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-99c7ed",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190522Z-e1dafe")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        