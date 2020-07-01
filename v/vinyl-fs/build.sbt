organization := "org.scalablytyped"
name := "vinyl-fs"
version := "2.4-dt-20200515Z-d8700c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200604Z-e0f252",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20200515Z-41d784",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-d64372",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200515Z-b6eed2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
