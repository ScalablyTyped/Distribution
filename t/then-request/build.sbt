organization := "org.scalablytyped"
name := "then-request"
version := "6.0.2-ebfd72"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "form-data" % "4.0.0-928296",
  "org.scalablytyped" %%% "http-basic" % "8.1.3-29c25a",
  "org.scalablytyped" %%% "http-response-object" % "3.0.2-4d626d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "promise" % "8.2.0-960f7c",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
