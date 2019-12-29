organization := "org.scalablytyped"
name := "xadesjs"
version := "2.0.16-c9a082"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "xml-core" % "1.0.20-e46fe0",
  "org.scalablytyped" %%% "xmldsigjs" % "2.0.27-85f4a8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        