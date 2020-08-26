organization := "org.scalablytyped"
name := "vue-loader"
version := "15.9.3-13dc68"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "postcss" % "7.0.32-540a6e",
  "org.scalablytyped" %%% "source-map" % "0.7.3-ff5daa",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "vue" % "2.6.11-238d86",
  "org.scalablytyped" %%% "vue-template-compiler" % "2.6.11-1d03c1",
  "org.scalablytyped" %%% "vue__component-compiler-utils" % "3.2.0-42ad08")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
