organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20200225Z-a28530"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200304Z-dcd5d0",
  "org.scalablytyped" %%% "globalize" % "0.0-unknown-dt-20200226Z-519d42",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200415Z-e1b00b",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20200225Z-af6075",
  "org.scalablytyped" %%% "requirejs" % "2.1.20-dt-20200227Z-1d6cdd",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20200225Z-96dac4",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-ca8578",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
