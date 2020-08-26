organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20200515Z-0710e2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200515Z-cb78e0",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20200527Z-f40094",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20200621Z-02ea23",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20200515Z-40f0a6",
  "org.scalablytyped" %%% "requirejs" % "2.1.20-dt-20200515Z-b7c2f5",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20200515Z-f32976",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-078440",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
