organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20200515Z-f6d841"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200923Z-0a8a52",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20201002Z-8bebe5",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-ec453d",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20201002Z-9885ce",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20201020Z-71f53f",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-ba78fd",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
