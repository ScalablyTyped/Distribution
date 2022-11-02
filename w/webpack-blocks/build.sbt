organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20211202Z-a8dc96"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6482f2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "re2" % "1.17.7-a226e5",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-3da904",
  "org.scalablytyped" %%% "source-map" % "0.7.4-01a3bb",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "uglify-js" % "3.17-dt-20221021Z-50b34a",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-3f97e9",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20211202Z-2bffce",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20211202Z-90eb79",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20221003Z-913007",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20211202Z-53d29d",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20211202Z-355f07",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20211202Z-9abbd9",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20211202Z-257529",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20211202Z-93e19a",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20221003Z-990d3c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
