organization := "org.scalablytyped"
name := "vue-rx"
version := "6.2.0-e6fdbe"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-64cd03",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d6ecc6",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "vue" % "2.6.11-1b5c25")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        