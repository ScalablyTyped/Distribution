organization := "org.scalablytyped"
name := "wepy-redux"
version := "1.7-dt-20190717Z-b93593"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "redux" % "4.0.5-174ff7",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "wepy" % "1.7-dt-20191126Z-154d47")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        