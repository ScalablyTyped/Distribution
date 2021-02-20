organization := "org.scalablytyped"
name := "vega-embed"
version := "6.13.0-fc61d9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "fast-json-patch" % "3.0.0-1-8d199d",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "vega" % "5.17.0-2a74b7",
  "org.scalablytyped" %%% "vega-lite" % "4.17.0-6c3044",
  "org.scalablytyped" %%% "vega-tooltip" % "0.24.2-523638",
  "org.scalablytyped" %%% "vega-typings" % "0.19.1-0db057",
  "org.scalablytyped" %%% "vega-util" % "1.16.0-d3ddb6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
