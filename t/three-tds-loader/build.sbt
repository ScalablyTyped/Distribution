organization := "org.scalablytyped"
name := "three-tds-loader"
version := "1.1-dt-20230123Z-35c879"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fflate" % "0.7.3-468e93",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "three" % "0.152-dt-20230525Z-1ce37a",
  "org.scalablytyped" %%% "tweenjs__tween_dot_js" % "21.0.0-960c95",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20230509Z-92b445")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
