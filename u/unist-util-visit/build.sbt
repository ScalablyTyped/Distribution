organization := "org.scalablytyped"
name := "unist-util-visit"
version := "2.0.3-22eb49"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-da75dd",
  "org.scalablytyped" %%% "unist-util-is" % "4.0.3-b56227",
  "org.scalablytyped" %%% "unist-util-visit-parents" % "3.1.1-61d5cc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
