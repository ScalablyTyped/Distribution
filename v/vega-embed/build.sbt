organization := "org.scalablytyped"
name := "vega-embed"
version := "4.2.1-7c2014"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180214Z-b08cd3",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "vega" % "5.4.0-ff8668",
  "org.scalablytyped" %%% "vega-lite" % "2.7.0-66ae76",
  "org.scalablytyped" %%% "vega-tooltip" % "0.17.1-25c1e8",
  "org.scalablytyped" %%% "vega-typings" % "0.7.1-e0167e",
  "org.scalablytyped" %%% "vega-util" % "1.10.0-2c2358")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        