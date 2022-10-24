organization := "org.scalablytyped"
name := "vega"
version := "5.22.1-ee4158"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-934111",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-a52279",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-d98f5b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
