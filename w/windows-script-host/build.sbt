organization := "org.scalablytyped"
name := "windows-script-host"
version := "5.8-dt-20190213Z-35b8cc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-1ecdbd",
  "org.scalablytyped" %%% "activex-iwshruntimelibrary" % "0.0-dt-20190213Z-dc60d1",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        