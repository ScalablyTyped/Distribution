organization := "org.scalablytyped"
name := "yeoman-test"
version := "2.0-dt-20190317Z-d12f8e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190424Z-9d0c50",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "rxjs" % "6.5.1-f03909",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-da6c97",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190501Z-43f1b8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        