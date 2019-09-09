organization := "org.scalablytyped"
name := "tgfancy"
version := "0.13-dt-20180822Z-354e8e"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-c0ff92",
  "org.scalablytyped" %%% "form-data" % "2.5.1-a9742c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "node-telegram-bot-api" % "0.31-dt-20190717Z-e9c5f4",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190909Z-40153f",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-011dc6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        