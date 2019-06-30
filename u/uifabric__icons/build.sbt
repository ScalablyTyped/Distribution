organization := "org.scalablytyped"
name := "uifabric__icons"
version := "6.5.3-5a8def"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190621Z-9e424f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.19.2-f273cc",
  "org.scalablytyped" %%% "uifabric__styling" % "6.50.1-225269",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.41.4-45329c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        