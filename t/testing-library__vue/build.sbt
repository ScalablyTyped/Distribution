organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-5876fa"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "20.0-dt-20190212Z-efc2ac",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "testing-library__dom" % "6.0-dt-20190815Z-83cd5d",
  "org.scalablytyped" %%% "vue" % "2.6.10-155520",
  "org.scalablytyped" %%% "vue-router" % "3.1.2-d2d68c",
  "org.scalablytyped" %%% "vuex" % "3.1.1-89f1e8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        