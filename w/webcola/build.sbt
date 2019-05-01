organization := "org.scalablytyped"
name := "webcola"
version := "3.3.9-a0d039"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-d6b8fa",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-026f99",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-ac870b",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-5ec687",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        