organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20190521Z-f093ee"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20191126Z-f6ebd9",
  "org.scalablytyped" %%% "globalize" % "0.0-unknown-dt-20191207Z-29908c",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-d6bfbf",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20191218Z-f43526",
  "org.scalablytyped" %%% "requirejs" % "2.1.20-dt-20190322Z-3fcb9e",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20190227Z-0c5f4f",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a9f7cc",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        