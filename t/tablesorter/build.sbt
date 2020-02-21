organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20190521Z-5307ae"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20191126Z-4e1104",
  "org.scalablytyped" %%% "globalize" % "0.0-unknown-dt-20200213Z-2bbb0a",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200204Z-ce7107",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20191218Z-e2f840",
  "org.scalablytyped" %%% "requirejs" % "2.1.20-dt-20190322Z-611c5f",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20190227Z-6c2fab",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a68146",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
