organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20200515Z-48a59c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200923Z-b7ccdf",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20201002Z-4394df",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-7fbb2b",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20201002Z-6ff692",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20201020Z-915e06",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-12b933",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
