organization := "org.scalablytyped"
name := "vega-embed"
version := "6.21.0-ab43ca"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6dfb17",
  "org.scalablytyped" %%% "fast-json-patch" % "3.1.1-790cc9",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "vega" % "5.22.1-cba0a8",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-165f2c",
  "org.scalablytyped" %%% "vega-lite" % "5.6.0-8ba05f",
  "org.scalablytyped" %%% "vega-tooltip" % "0.28.0-66b2ab",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-f5bca6",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-afec37")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
