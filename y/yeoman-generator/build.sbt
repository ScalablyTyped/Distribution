organization := "org.scalablytyped"
name := "yeoman-generator"
version := "4.11-dt-20201016Z-8d8db1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-c5583a",
  "org.scalablytyped" %%% "ejs" % "3.0-dt-20201020Z-0e0de9",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-ac41cb",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-07117c",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200831Z-db17a7",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-51755d",
  "org.scalablytyped" %%% "mem-fs-editor" % "7.0-dt-20200707Z-3afcf0",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-57d176",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-09c192",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-1c9095",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-0230cb",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-0812a6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
