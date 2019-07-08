organization := "org.scalablytyped"
name := "windows-script-host"
version := "5.8-dt-20190213Z-9a6c2e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-5b5138",
  "org.scalablytyped" %%% "activex-iwshruntimelibrary" % "0.0-dt-20190213Z-94c48e",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        