organization := "org.scalablytyped"
name := "vinyl-fs"
version := "2.4-dt-20200515Z-e6584e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-ac41cb",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20201002Z-428938",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-57d176",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-0812a6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
