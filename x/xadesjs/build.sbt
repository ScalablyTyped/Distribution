organization := "org.scalablytyped"
name := "xadesjs"
version := "2.0.15-58c8dc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "xml-core" % "1.0.15-14b703",
  "org.scalablytyped" %%% "xmldsigjs" % "2.0.25-f6a779")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        