organization := "org.scalablytyped"
name := "typedoc"
version := "0.15.6-92c245"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "handlebars" % "4.5.3-aa147d",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-815e4e",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "typescript" % "3.7.4-b5a092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        