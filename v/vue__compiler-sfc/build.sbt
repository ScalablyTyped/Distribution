organization := "org.scalablytyped"
name := "vue__compiler-sfc"
version := "3.0.2-d92e75"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-c27ec6",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-603dc7",
  "org.scalablytyped" %%% "postcss" % "7.0.35-e8d6f4",
  "org.scalablytyped" %%% "source-map" % "0.7.3-d3bdbd",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.0.2-5c81c2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
