organization := "org.scalablytyped"
name := "vue-loader"
version := "15.9.5-1dbee8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "postcss" % "7.0.35-e8d6f4",
  "org.scalablytyped" %%% "source-map" % "0.7.3-d3bdbd",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "vue" % "2.6.12-307c4c",
  "org.scalablytyped" %%% "vue-template-compiler" % "2.6.12-411143",
  "org.scalablytyped" %%% "vue__component-compiler-utils" % "3.2.0-a9ded4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
