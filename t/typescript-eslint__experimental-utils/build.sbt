organization := "org.scalablytyped"
name := "typescript-eslint__experimental-utils"
version := "1.13.0-a25365"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-58e914",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "typescript" % "3.6.2-08574c",
  "org.scalablytyped" %%% "typescript-eslint__typescript-estree" % "1.13.0-d3451c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        