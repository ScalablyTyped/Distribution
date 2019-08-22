organization := "org.scalablytyped"
name := "typescript-eslint__experimental-utils"
version := "1.13.0-14e609"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-565518",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "typescript" % "3.5.3-521c41",
  "org.scalablytyped" %%% "typescript-eslint__typescript-estree" % "1.13.0-4d0522")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        