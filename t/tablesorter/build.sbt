organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20211202Z-b0e22f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20220818Z-55ec6e",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20211202Z-3c9163",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-894e6b",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20211202Z-f18a23",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20220127Z-cd152b",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-1d3faa",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
