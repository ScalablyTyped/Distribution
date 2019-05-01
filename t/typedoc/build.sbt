organization := "org.scalablytyped"
name := "typedoc"
version := "0.14.2-9f9dac"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "handlebars" % "4.1.2-632f9f",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-307dea",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "typescript" % "3.4.5-6b8b79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        