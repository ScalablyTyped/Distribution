organization := "org.scalablytyped"
name := "uirouter__angularjs"
version := "1.0.22-56de94"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-c98868",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "uirouter__core" % "5.0.23-90cb56")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        