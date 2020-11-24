organization := "org.scalablytyped"
name := "yeoman-test"
version := "2.0-dt-20201016Z-3f39a4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-423206",
  "org.scalablytyped" %%% "ejs" % "3.0-dt-20201020Z-5d46b4",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-3075c2",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-1df9fb",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200831Z-13c485",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-b93368",
  "org.scalablytyped" %%% "mem-fs-editor" % "7.0-dt-20200707Z-100cab",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-bab05f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-8d21ff",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-af84f1",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-aa5679",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-c002e2",
  "org.scalablytyped" %%% "yeoman-generator" % "4.11-dt-20201016Z-29c773")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
