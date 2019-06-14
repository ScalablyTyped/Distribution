organization := "org.scalablytyped"
name := "windows-script-host"
version := "5.8-dt-20190213Z-999c06"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-f41bad",
  "org.scalablytyped" %%% "activex-iwshruntimelibrary" % "0.0-dt-20190213Z-011f5e",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        