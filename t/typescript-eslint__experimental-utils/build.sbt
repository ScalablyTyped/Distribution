organization := "org.scalablytyped"
name := "typescript-eslint__experimental-utils"
version := "1.13.0-5871c7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-9fcec6",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "typescript" % "3.6.4-7a19dc",
  "org.scalablytyped" %%% "typescript-eslint__typescript-estree" % "1.13.0-dd2bd2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        