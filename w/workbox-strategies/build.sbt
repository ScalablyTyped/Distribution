organization := "org.scalablytyped"
name := "workbox-strategies"
version := "4.3-dt-20191115Z-6fa911"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "workbox-core" % "4.3-dt-20191115Z-4f3d14",
  "org.scalablytyped" %%% "workbox-routing" % "4.3-dt-20191115Z-96f2ff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        