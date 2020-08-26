organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20200227Z-f5b3c9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200721Z-bd5cf0",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-5a69c5",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "rxjs" % "6.6.2-ccb1c2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.2-08247c",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-efda06",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200515Z-5db8a3",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20200515Z-049874")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
