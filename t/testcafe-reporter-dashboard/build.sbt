organization := "org.scalablytyped"
name := "testcafe-reporter-dashboard"
version := "0.2.7-rc.1-7bd53d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fp-ts" % "2.13.1-47feb6",
  "org.scalablytyped" %%% "io-ts" % "2.2.19-4c9637",
  "org.scalablytyped" %%% "io-ts-types" % "0.5.17-ecf534",
  "org.scalablytyped" %%% "monocle-ts" % "2.3.13-5bf1fe",
  "org.scalablytyped" %%% "newtype-ts" % "0.3.5-888ef7",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
