organization := "org.scalablytyped"
name := "uirouter__angularjs"
version := "1.0.30-782c9c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular" % "1.8-dt-20220525Z-5fbc4b",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "uirouter__core" % "6.0.8-433365")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
