organization := "org.scalablytyped"
name := "vue-docgen-api"
version := "4.33.9-15d204"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ast-types" % "0.14.2-5651d1",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-cda1da",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-2e813b",
  "org.scalablytyped" %%% "pug" % "2.0-dt-20201002Z-f6baec",
  "org.scalablytyped" %%% "source-map" % "0.7.3-475dad",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "ts-map" % "1.0.3-876d25",
  "org.scalablytyped" %%% "vue-inbrowser-compiler-utils" % "4.33.6-77cfa2",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.0.2-e84d2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
