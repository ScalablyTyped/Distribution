organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190522Z-d2dcd4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-4a2153",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-28a413",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-11b18b",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-35ee38",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-eab6d2",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190522Z-a77c8d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        