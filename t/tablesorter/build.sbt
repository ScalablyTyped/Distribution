organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20200515Z-69104a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200515Z-7c2a87",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20200527Z-4b9e9a",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20200621Z-33c88a",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20200515Z-430db3",
  "org.scalablytyped" %%% "requirejs" % "2.1.20-dt-20200515Z-fa5c43",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20200515Z-a5fde1",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-775559",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
