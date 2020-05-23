organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20200515Z-3ff2d3"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200515Z-58f895",
  "org.scalablytyped" %%% "globalize" % "0.0-unknown-dt-20200515Z-61cc4c",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200515Z-5d5c16",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20200515Z-d27208",
  "org.scalablytyped" %%% "requirejs" % "2.1.20-dt-20200515Z-02c4d9",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20200515Z-21fe3b",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-b4597c",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
