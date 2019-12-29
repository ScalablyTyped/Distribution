organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-71488b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-3b4753",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "testing-library__dom" % "6.11-dt-20191216Z-cc4c1d",
  "org.scalablytyped" %%% "vue" % "2.6.11-1b5c25",
  "org.scalablytyped" %%% "vue-router" % "3.1.3-3c9410",
  "org.scalablytyped" %%% "vuex" % "3.1.2-ecfd2c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        