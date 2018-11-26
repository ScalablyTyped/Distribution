```
// Type definitions for swagger-express-middleware 1.x
// Project: https://github.com/BigstickCarpet/swagger-express-middleware
// Definitions by: Alexandre Roba <https://github.com/alexandreroba>
//                 Tromgy <https://github.com/tromgy>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.3
/* =================== USAGE ===================
import * as express from "express";
import * as SwaggerExpressMiddleware from "swagger-express-middleware";

let app = express();

SwaggerExpressMiddleware("PetStore.yaml", app, (err: any, middleware: SwaggerExpressMiddleware.SwaggerMiddleware) => {
    app.use(
        middleware.metadata(),
        middleware.CORS(),
        middleware.files(),
        middleware.parseRequest(),
        middleware.validateRequest(),
        middleware.mock()
    );
});

app.listen(8000, function () {
    console.log('The PetStore sample is now running at http://localhost:8000');
});

 =============================================== */

```