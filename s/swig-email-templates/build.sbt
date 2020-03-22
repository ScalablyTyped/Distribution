organization := "org.scalablytyped"
name := "swig-email-templates"
version := "5.0-dt-20181016Z-3a162c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200204Z-2d3992",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3d9ead",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "swig" % "0.0-unknown-dt-20190322Z-1e272a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
