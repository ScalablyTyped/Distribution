organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-12f301"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "20.0-dt-20190212Z-20116b",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "testing-library__dom" % "6.0-dt-20190819Z-8767f0",
  "org.scalablytyped" %%% "vue" % "2.6.10-b372e7",
  "org.scalablytyped" %%% "vue-router" % "3.1.3-5d2432",
  "org.scalablytyped" %%% "vuex" % "3.1.1-db3dab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        